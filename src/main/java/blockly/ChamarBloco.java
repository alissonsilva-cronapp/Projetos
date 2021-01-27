package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ChamarBloco {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ChamarBloco
public static Var getDados() throws Exception {
 return new Callable<Var>() {

   private Var retorno = Var.VAR_NULL;

   public Var call() throws Exception {

    retorno =
    blockly.Teste.getDados(
    Var.valueOf("https://desenvolvimento.marista.edu.br/api-docente/v2/alunos-turma"),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("Authorization",
    Var.valueOf(
    Var.valueOf("Bearer").toString() +
    Var.valueOf("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJEVVJWQUwgQUxWRVMgREEgU0lMVkEiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiLCJvcGVuaWQiXSwiYXR0cmlidXRlcyI6eyJuYXNjIjoiMTk1Ny0wOS0xMyIsImdlbmVybyI6Ik0iLCJjcGYiOiIxNTQ2MDQwMTQ1MyIsImNvZFBlc3NvYSI6Ijk5Nzc5In0sImlkIjoiMjc4MSIsImV4cCI6MTYxMTc2OTEyMiwiaWF0IjoxNjA4NzQ1MTIyLCJhdXRob3JpdGllcyI6WyJST0xFX0RPQ0VOVEUiXSwianRpIjoiYjlkMWEzNzctZTgwMy00MmIwLTlkNTYtYWM3YjM3ZmFmNTU4IiwiZW1haWwiOm51bGwsImNsaWVudF9pZCI6IlRlY2huZUFwcCJ9.EawhO1zxGKYH9b9ieHKoaca1oATTUILViYqDQlnXS2CMlwC1ia7Bqjuq3ZivDjEAg43b4JVjarTdo4ZWW2hx1tanst3-SdEEvJRFk4Zkm2ScqVb9mWtbTMnOtKu758jm7j2FS8dwe2_38IaHt-_ohlemj9YEim81u3Kx-dXp79Dc6cXkGDMbTgqMeK1dRHpMC5vbSTqCe3XlVcwLMuamcZ9ezxe0Kc-osnrKkl10AYHRAaCZDeJ2VdPKjkYOp0GNcbgG1tUOMDSfqI3r4Un1kKycgve77okdseYrsifXnwvkLWeOBHbJPOOruL9k3vAU2Kbi1kbpcG7uxsF1vzuy4A").toString()))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codDisciplina",
    Var.valueOf("214032003")) , Var.valueOf("codTurma",
    Var.valueOf("EM-2ºA-M")) , Var.valueOf("ano",
    Var.valueOf("2020")) , Var.valueOf("semestre",
    Var.valueOf("0"))));
    return
cronapi.json.Operations.getJsonOrMapField(retorno,
Var.valueOf("data"));
   }
 }.call();
}

}

