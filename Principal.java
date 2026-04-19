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

                    continuar = JOptionPane.showInputDialog(layout("ALTERAÇÃO", "NOVA ALTERAÇÃO (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }

            // >>> AQUI COMEÇA A TELA 1.1.3 
            if (MENUCD == 3) { //CONSULTA

                String continuar = "S";

                while (continuar.equalsIgnoreCase("S")) {

                    String nome = JOptionPane.showInputDialog(layout("CONSULTA DE PRODUTO", "NOME:"));
                    String preco = "10.00";
                    String unidade = "UN";
                    String quantidade = "50";

                    JOptionPane.showMessageDialog(null,
                        layout("CONSULTA DE PRODUTO",
                        "NOME        : " + nome + "<br>"
                      + "PREÇO       : " + preco + "<br>"
                      + "UNIDADE     : " + unidade + "<br>"
                      + "QUANTIDADE : " + quantidade)
                    );

                    continuar = JOptionPane.showInputDialog(layout("CONSULTA", "NOVA CONSULTA (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }

            // >>> AQUI COMEÇA A TELA 1.1.4 
            if (MENUCD == 4) { //EXCLUSÃO

                String continuar = "S";

                while (continuar.equalsIgnoreCase("S")) {

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

                    continuar = JOptionPane.showInputDialog(layout("EXCLUSÃO", "NOVA EXCLUSÃO (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }

            }
        }

        if (MENUPP == 2) {

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

            if (MENUMV == 1) {

                String continuar = "S";

                while (continuar.equalsIgnoreCase("S")) {

                    String produto = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - ENTRADA DE PRODUTO", "PRODUTO:"));
                    String qtdeAtualStr = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - ENTRADA DE PRODUTO", "QTDE ATUAL:"));
                    String qtdeEntradaStr = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - ENTRADA DE PRODUTO", "QTDE ENTRADA:"));

                    int qtdeAtual = Integer.parseInt(qtdeAtualStr);
                    int qtdeEntrada = Integer.parseInt(qtdeEntradaStr);
                    int qtdeFinal = qtdeAtual + qtdeEntrada;

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

                    continuar = JOptionPane.showInputDialog(layout("ENTRADA", "NOVA ENTRADA (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }

            if (MENUMV == 2) {

                String continuar = "S";

                while (continuar.equalsIgnoreCase("S")) {

                    String produto = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - SAÍDA DE PRODUTO", "PRODUTO:"));
                    String qtdeAtualStr = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - SAÍDA DE PRODUTO", "QTDE ATUAL:"));
                    String qtdeSaidaStr = JOptionPane.showInputDialog(layout("MOVIMENTAÇÃO - SAÍDA DE PRODUTO", "QTDE SAÍDA:"));

                    int qtdeAtual = Integer.parseInt(qtdeAtualStr);
                    int qtdeSaida = Integer.parseInt(qtdeSaidaStr);
                    int qtdeFinal = qtdeAtual - qtdeSaida;

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

                    continuar = JOptionPane.showInputDialog(layout("SAÍDA", "NOVA SAÍDA (S/N)?"));

                    if (continuar == null || continuar.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }

            }
        }

        // >>> AQUI COMEÇA A TELA 1.3
        if (MENUPP == 3) { //REAJUSTE DE PREÇOS

            String continuar = "S"; //controla repetição da tela

            while (continuar.equalsIgnoreCase("S")) {

                String nome = JOptionPane.showInputDialog(layout("REAJUSTE DE PREÇOS", "NOME DO PRODUTO:"));

                String unidade = "UN";
                String precoAtual = "10.00";

                String novoPreco = JOptionPane.showInputDialog(
                    layout("REAJUSTE DE PREÇOS",
                    "UNIDADE      : " + unidade + "<br>"
                  + "PREÇO ATUAL  : " + precoAtual + "<br>"
                  + "NOVO PREÇO:")
                );

                String confirmacao = JOptionPane.showInputDialog(
                    layout("REAJUSTE DE PREÇOS",
                    "PRODUTO      : " + nome + "<br>"
                  + "UNIDADE      : " + unidade + "<br>"
                  + "PREÇO ATUAL  : " + precoAtual + "<br>"
                  + "NOVO PREÇO   : " + novoPreco + "<br><br>"
                  + "CONFIRMA REAJUSTE (S/N)?")
                );

                if (confirmacao != null && confirmacao.equalsIgnoreCase("S")) {
                    JOptionPane.showMessageDialog(null, layout("SISTEMA", "Reajuste realizado com sucesso!"));
                } else {
                    JOptionPane.showMessageDialog(null, layout("SISTEMA", "Reajuste cancelado."));
                }

                continuar = JOptionPane.showInputDialog(layout("REAJUSTE", "NOVO REAJUSTE (S/N)?"));

                if (continuar == null || continuar.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }

        }
    }

    // >>> MÉTODO PADRÃO DE LAYOUT (PADRONIZA TUDO) 
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
