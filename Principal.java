import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        int MENUPP = -1; //atribui um valor á varivel -1 pra ela poder ser utilizada no loop (estou usando loop para a gente conseguir voltar para esse menu depois).
        
        while (MENUPP != 0) { //isso faz o loop continuar rodando enquanto o input não for 0, ou seja, 0 = finalizar loop.
        
        String MENUPRINCIPAL = JOptionPane.showInputDialog(
                layout("MENU PRINCIPAL",
                "1 - CADASTRO DE PRODUTO<br>"
              + "2 - MOVIMENTAÇÃO<br>"
              + "3 - REAJUSTE DE PREÇOS<br>"
              + "4 - RELATÓRIOS<br>"
              + "0 - FINALIZAR")
             );
        
        if (MENUPRINCIPAL == null) break; // Evita erro se fechar a janela no X
        MENUPP = Integer.parseInt(MENUPRINCIPAL);
        
        if (MENUPP == 1) { //condição para caso o input seja 1, levando para o menu de cadastro
            
            int MENUCD = -1;
            
            while (MENUCD != 0) {
            String MENUCADASTRO = JOptionPane.showInputDialog(
                layout("CADASTRO DE PRODUTOS",
                "1 - INCLUSÃO<br>"
              + "2 - ALTERAÇÃO<br>"
              + "3 - CONSULTA<br>"
              + "4 - EXCLUSÃO<br>"
              + "0 - RETORNAR")
            );

            if (MENUCADASTRO == null) break;
            MENUCD = Integer.parseInt(MENUCADASTRO);

            // >>> AQUI COMEÇA A TELA 1.1.1 
            if (MENUCD == 1) { //INCLUSÃO

                String continuar = "S"; //controla repetição da tela

                while (continuar.equalsIgnoreCase("S")) {

                    //campos de entrada - Agora usando o layout para manter o tamanho
                    String nome = JOptionPane.showInputDialog(layout("INCLUSÃO DE PRODUTO", "NOME:"));
                    String preco = JOptionPane.showInputDialog(layout("INCLUSÃO DE PRODUTO", "PREÇO:"));
                    String unidade = JOptionPane.showInputDialog(layout("INCLUSÃO DE PRODUTO", "UNIDADE:"));
                    String quantidade = JOptionPane.showInputDialog(layout("INCLUSÃO DE PRODUTO", "QUANTIDADE:"));

                    String confirmacao = JOptionPane.showInputDialog(
                        layout("INCLUSÃO DE PRODUTO",
                        "NOME        : " + nome + "<br>"
                      + "PREÇO       : " + preco + "<br>"
                      + "UNIDADE     : " + unidade + "<br>"
                      + "QUANTIDADE : " + quantidade + "<br><br>"
                      + "CONFIRMA INCLUSÃO (S/N)?")
                    );

                    if (confirmacao != null && confirmacao.equalsIgnoreCase("S")) {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Produto cadastrado com sucesso!"));
                    } else {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Cadastro cancelado."));
                    }

                    //nova alteração
                    continuar = JOptionPane.showInputDialog(layout("INCLUSÃO", "NOVA INCLUSÃO (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break; //volta pro menu cadastro
                    }
                }
            }

            // >>> AQUI COMEÇA A TELA 1.1.2 
            if (MENUCD == 2) { //ALTERAÇÃO

                String continuar = "S"; //controla repetição

                while (continuar.equalsIgnoreCase("S")) {

                    //campos de entrada
                    String nome = JOptionPane.showInputDialog(layout("ALTERAÇÃO DE PRODUTO", "NOME:"));
                    String preco = JOptionPane.showInputDialog(layout("ALTERAÇÃO DE PRODUTO", "PREÇO:"));
                    String unidade = JOptionPane.showInputDialog(layout("ALTERAÇÃO DE PRODUTO", "UNIDADE:"));
                    String quantidade = JOptionPane.showInputDialog(layout("ALTERAÇÃO DE PRODUTO", "QUANTIDADE:"));

                    String confirmacao = JOptionPane.showInputDialog(
                        layout("ALTERAÇÃO DE PRODUTO",
                        "NOME        : " + nome + "<br>"
                      + "PREÇO       : " + preco + "<br>"
                      + "UNIDADE     : " + unidade + "<br>"
                      + "QUANTIDADE : " + quantidade + "<br><br>"
                      + "CONFIRMA ALTERAÇÃO (S/N)?")
                    );

                    if (confirmacao != null && confirmacao.equalsIgnoreCase("S")) {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Produto alterado com sucesso!"));
                    } else {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Alteração cancelada."));
                    }

                    //nova alteração
                    continuar = JOptionPane.showInputDialog(layout("ALTERAÇÃO", "NOVA ALTERAÇÃO (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break; //volta pro menu cadastro
                    }
                }
            }

            // >>> AQUI COMEÇA A TELA 1.1.3 
            if (MENUCD == 3) { //CONSULTA

                String continuar = "S"; //controla repetição da tela de consulta

                while (continuar.equalsIgnoreCase("S")) {

                    //campos de entrada
                    String nome = JOptionPane.showInputDialog(layout("CONSULTA DE PRODUTO", "NOME:"));
                    String preco = "10.00"; // Exemplo de valor que viria de uma busca
                    String unidade = "UN";
                    String quantidade = "50";

                    JOptionPane.showMessageDialog(null,
                        layout("CONSULTA DE PRODUTO",
                        "NOME        : " + nome + "<br>"
                      + "PREÇO       : " + preco + "<br>"
                      + "UNIDADE     : " + unidade + "<br>"
                      + "QUANTIDADE : " + quantidade)
                    );

                    //nova consulta
                    continuar = JOptionPane.showInputDialog(layout("CONSULTA", "NOVA CONSULTA (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break; //volta pro menu cadastro (tela 1.1)
                    }
                }
            }

            // >>> AQUI COMEÇA A TELA 1.1.4 
            if (MENUCD == 4) { //EXCLUSÃO

                String continuar = "S"; //controla repetição da tela de exclusão

                while (continuar.equalsIgnoreCase("S")) {

                    //campos de entrada
                    String nome = JOptionPane.showInputDialog(layout("EXCLUSÃO DE PRODUTO", "NOME DO PRODUTO A EXCLUIR:"));
                    
                    String confirmacao = JOptionPane.showInputDialog(
                        layout("EXCLUSÃO DE PRODUTO",
                        "NOME        : " + nome + "<br><br>"
                      + "CONFIRMA EXCLUSÃO (S/N)?")
                    );

                    if (confirmacao != null && confirmacao.equalsIgnoreCase("S")) {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Produto excluído com sucesso!"));
                    } else {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Exclusão cancelada."));
                    }

                    //nova exclusão
                    continuar = JOptionPane.showInputDialog(layout("EXCLUSÃO", "NOVA EXCLUSÃO (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break; //volta pro menu cadastro (tela 1.1)
                    }
                }
            }

            }
        }

        if (MENUPP == 2) { //é a mesma lógica de antes daqui pra frente
            
            int MENUMV = -1;
            
            while (MENUMV != 0) {
                String MENUMOVIMENTACAO = JOptionPane.showInputDialog(
                layout("MOVIMENTAÇÃO",
                "1 - ENTRADA<br>"
              + "2 - SAIDA<br>"
              + "0 - RETORNAR")
            );
            if (MENUMOVIMENTACAO == null) break;
            MENUMV = Integer.parseInt(MENUMOVIMENTACAO);

            // >>> AQUI COMEÇA A TELA 1.2.1 
            if (MENUMV == 1) { //ENTRADA DE PRODUTO

                String continuar = "S"; //controla repetição da tela de entrada

                while (continuar.equalsIgnoreCase("S")) {

                    //campos de entrada
                    String produto = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - ENTRADA DE PRODUTO", "PRODUTO:"));
                    
                    //quantidade atual do produto no estoque
                    String qtdeAtualStr = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - ENTRADA DE PRODUTO", "QTDE ATUAL:"));
                    
                    //quantidade que está entrando no estoque
                    String qtdeEntradaStr = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - ENTRADA DE PRODUTO", "QTDE ENTRADA:"));

                    //calcula a quantidade final somando atual + entrada
                    int qtdeAtual = Integer.parseInt(qtdeAtualStr);
                    int qtdeEntrada = Integer.parseInt(qtdeEntradaStr);
                    int qtdeFinal = qtdeAtual + qtdeEntrada;

                    //exibe confirmação com os dados preenchidos e a quantidade final calculada
                    String confirmacao = JOptionPane.showInputDialog(
                        layout("MOVIMENTAÇÃO - ENTRADA DE PRODUTO",
                        "PRODUTO      : " + produto + "<br>"
                      + "QTDE ATUAL   : " + qtdeAtual + "<br>"
                      + "QTDE ENTRADA : " + qtdeEntrada + "<br>"
                      + "QTDE FINAL   : " + qtdeFinal + "<br><br>"
                      + "CONFIRMA ENTRADA (S/N)?")
                    );

                    if (confirmacao != null && confirmacao.equalsIgnoreCase("S")) {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Entrada registrada com sucesso!"));
                    } else {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Entrada cancelada."));
                    }

                    //nova entrada - reabre a tela 1.2.1 se "S", retorna para tela 1.2 se "N"
                    continuar = JOptionPane.showInputDialog(layout("ENTRADA", "NOVA ENTRADA (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break; //volta pro menu movimentação (tela 1.2)
                    }
                }
            }

            // >>> AQUI COMEÇA A TELA 1.2.2 <
            if (MENUMV == 2) { //SAÍDA DE PRODUTO

                String continuar = "S"; //controla repetição da tela de saída

                while (continuar.equalsIgnoreCase("S")) {

                    //campos de entrada
                    String produto = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - SAÍDA DE PRODUTO", "PRODUTO:"));

                    //quantidade atual do produto no estoque
                    String qtdeAtualStr = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - SAÍDA DE PRODUTO", "QTDE ATUAL:"));

                    //quantidade que está saindo do estoque
                    String qtdeSaidaStr = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - SAÍDA DE PRODUTO", "QTDE SAÍDA:"));

                    //calcula a quantidade final subtraindo saída da atual
                    int qtdeAtual = Integer.parseInt(qtdeAtualStr);
                    int qtdeSaida = Integer.parseInt(qtdeSaidaStr);
                    int qtdeFinal = qtdeAtual - qtdeSaida;

                    //exibe confirmação com os dados preenchidos e a quantidade final calculada
                    String confirmacao = JOptionPane.showInputDialog(
                        layout("MOVIMENTAÇÃO - SAÍDA DE PRODUTO",
                        "PRODUTO     : " + produto + "<br>"
                      + "QTDE ATUAL  : " + qtdeAtual + "<br>"
                      + "QTDE SAÍDA  : " + qtdeSaida + "<br>"
                      + "QTDE FINAL  : " + qtdeFinal + "<br><br>"
                      + "CONFIRMA SAÍDA (S/N)?")
                    );

                    if (confirmacao != null && confirmacao.equalsIgnoreCase("S")) {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Saída registrada com sucesso!"));
                    } else {
                        JOptionPane.showMessageDialog(null, layout("SISTEMA", "Saída cancelada."));
                    }

                    //nova saída - reabre a tela 1.2.2 se "S", retorna para tela 1.2 se "N"
                    continuar = JOptionPane.showInputDialog(layout("SAÍDA", "NOVA SAÍDA (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break; //volta pro menu movimentação (tela 1.2)
                    }
                }
            }

            }
        
        }
        }
    }

    // >>> MÉTODO PADRÃO DE LAYOUT (PADRONIZA TUDO) 
    // Aumentei para 350px para ficar mais parecido com a sua imagem
    public static String layout(String titulo, String conteudo) {
        return "<html><div style='width:350px; text-align:center; font-family: sans-serif;'>"
             + "GESTÃO LTDA<br>"
             + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
             + "<b>" + titulo + "</b><br><br>"
             + "<div style='text-align:left;'>"
             + conteudo
             + "</div></div></html>";
    }
}
