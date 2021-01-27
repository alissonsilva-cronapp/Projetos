package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

public static final int TIMEOUT = 300;

/**
 *
 * @param endpoint
 * @param authData
 * @param params
 * @return Var
 */
// Descreva esta função...
public static Var getDados(Var endpoint, Var authData, Var params) throws Exception {
 return new Callable<Var>() {

   private Var retorno = Var.VAR_NULL;

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("Realizando Requisição:").getObjectAsString());

    retorno =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/json"), endpoint, params, authData, Var.VAR_NULL);

    System.out.println(
    Var.valueOf("Fim da Requisição, resultado:").getObjectAsString());

    System.out.println(retorno.getObjectAsString());
    return
cronapi.json.Operations.toJson(retorno);
   }
 }.call();
}

}

