package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GestaoEvento {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// GestaoEvento
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var listaFiltrada = Var.VAR_NULL;
   private Var listaTeste = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var itemLista = Var.VAR_NULL;

   public Var call() throws Exception {

    listaFiltrada =
    cronapi.list.Operations.newList();

    listaTeste =
    cronapi.object.Operations.newObject(Var.valueOf("app.entity.View"),Var.valueOf("pattern",
    cronapi.database.Operations.query(Var.valueOf("app.entity.View"),Var.valueOf("select v.pattern from View v"))));

    System.out.println(listaTeste.getObjectAsString());

    for (Iterator it_i =
    cronapi.json.Operations.getJsonOrMapField(listaTeste,
    Var.valueOf("pattern")).iterator(); it_i.hasNext();) {
        i = Var.valueOf(it_i.next());

        itemLista =
        cronapi.object.Operations.newObject(Var.valueOf("app.entity.View"),Var.valueOf("pattern",i));

        System.out.println(
        Var.valueOf("Filtrada:").getObjectAsString());

        System.out.println(itemLista.getObjectAsString());

        cronapi.list.Operations.addLast(listaFiltrada,itemLista);
    } // end for

    System.out.println(
    Var.valueOf("Fim da Requisição!").getObjectAsString());

    System.out.println(listaFiltrada.getObjectAsString());
    return listaFiltrada;
   }
 }.call();
}

}

