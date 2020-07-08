package bo.edu.ucb.sis.piratebay.controller;

import bo.edu.ucb.sis.piratebay.bl.KardexBl;
import bo.edu.ucb.sis.piratebay.bl.PepsBl;
import bo.edu.ucb.sis.piratebay.model.KardexModel;
import bo.edu.ucb.sis.piratebay.model.PepsModel;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/peps")
@CrossOrigin(origins = "*")
public class PepsController {

    private PepsBl pepsBl;

    @Value("${piratebay.security.secretJwt}")
    private String secretJwt;

    @Autowired
    public PepsController(PepsBl pepsBl) {
        this.pepsBl= pepsBl;
    }

    @RequestMapping(method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PepsModel>> findAllAttributes(@RequestHeader("Authorization") String authorization, @RequestBody String json) throws JSONException { // bearer asdasdasdasd

        // Lo unico que estamos haciendo es decodificar el token.
        String tokenJwT = authorization.substring(7);
        System.out.println("TOKEN JWT: " + tokenJwT);
        DecodedJWT decodedJWT = JWT.decode(tokenJwT);
        String idUsuario = decodedJWT.getSubject();
        System.out.println("USUARIO: " + idUsuario);
        JSONObject jsonObject = new JSONObject(json);
        String order = jsonObject.getString("orderName");
        System.out.println("ORDER_NAME: " + order);
        if(!"AUTHN".equals(decodedJWT.getClaim("type").asString()) ) {
            throw new RuntimeException("El token proporcionado no es un token de Autenthication");
        }
        // El siguiente código valida si el token es bueno y ademas es un token de authentication

        Algorithm algorithm = Algorithm.HMAC256(secretJwt);
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("PirateBay")
                .build();
        verifier.verify(tokenJwT);

        return new ResponseEntity<>( this.pepsBl.findAllAttributes(order), HttpStatus.OK);
    }
}
