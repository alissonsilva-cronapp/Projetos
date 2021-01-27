window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoServidor = window.blockly.js.blockly.BlocoServidor || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.BlocoServidor.getDados = async function() {
 var item, retorno;
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.ChamarBloco:getDados', async function(sender_retorno) {
      retorno = sender_retorno;
    console.log('Fim da Consulta, Retorno: ');
    console.log(retorno);
  }.bind(this));
}
