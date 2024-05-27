package Aparelho;
import java.util.Scanner;

public class Aparelho extends iPhone {
    public static void main(String[] args) {
        
        iPhone aparelho = new iPhone();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        boolean tocandoMusica = false;
        
        while (continuar) {
            
            System.out.println("SEJA BEM VINDO AO IPHONE!");
            System.out.println("Selecione o aplicativo:");
            System.out.println("1) Reprodutor Musical");
            System.out.println("2) Navegador Internet");
            System.out.println("3) Aparelho Telefônico");
            System.out.println("0) Bloquear Telefone");
            int opcao = scanner.nextInt();
            boolean continuarApp = true;

            switch (opcao) {
                case 1:
                    while (continuarApp) {
                        
                        System.out.println("Selecione o que deseja fazer:");
                        System.out.println("1) Tocar Música");
                        System.out.println("2) Pausar Música");
                        System.out.println("3) Selecionar Música");
                        System.out.println("0) Fechar Aplicativo");
                        int opcaoMusica = scanner.nextInt();
                        if (opcaoMusica == 1) {
                            aparelho.tocar(tocandoMusica);
                            tocandoMusica = true;
                        }else if (opcaoMusica == 2){
                            aparelho.pausar(tocandoMusica);
                            tocandoMusica = false;
                        } else if (opcaoMusica == 3) {
                            System.out.println("QUAL MÚSICA VOCÊ DESEJA TOCAR?");
                            String musica = scanner.next();
                            aparelho.selecionarMusica(musica);
                        } else {
                            System.out.println("ESSA OPÇÃO NÃO EXISTE, FECHANDO APLICATIVO");                
                            continuarApp = false;
                        }
                    }
                break;

                case 2:
                    while (continuarApp) {
                        System.out.println("Selecione o que deseja fazer:");
                        System.out.println("1) Adicionar Nova Aba");
                        System.out.println("2) Exibir Página");
                        System.out.println("3) Atualizar Página");
                        System.out.println("0) Fechar Aplicativo");
                        int opcaoInternet = scanner.nextInt();
                        if (opcaoInternet == 1) {
                            aparelho.adicionarNovaAba();
                        }else if (opcaoInternet == 3){
                            aparelho.atualizarPagina();
                        } else if (opcaoInternet == 2) {
                            System.out.println("DIGITE A URL DA PÁGINA QUE VOCÊ DESEJA ABRIR");
                            String url = scanner.next();
                            aparelho.exibirPagina(url);
                        } else {
                            System.out.println("ESSA OPÇÃO NÃO EXISTE, FECHANDO APLICATIVO");  
                            continuarApp = false;             
                        }
                    }
                break;   
            
                case 3:
                    while (continuarApp) {
                        System.out.println("Selecione o que deseja fazer:");
                        System.out.println("1) Ligar");
                        System.out.println("2) Atender Ligação");
                        System.out.println("3) Iniciar Correio de Voz");
                        System.out.println("0) Fechar Aplicativo");
                        int opcaoTelefone = scanner.nextInt();
                        if (opcaoTelefone == 2) {
                            aparelho.atender();
                        }else if (opcaoTelefone == 3){
                            aparelho.iniciarCorreioVoz();
                        } else if (opcaoTelefone == 1) {
                            System.out.println("DIGITE O NÚMERO PARA O QUAL VOCÊ QUER LIGAR:");
                            String numero = scanner.next();
                            aparelho.ligar(numero);
                        } else {
                            System.out.println("ESSA OPÇÃO NÃO EXISTE, FECHANDO APLICATIVO");  
                            continuarApp = false;              
                        }
                    }
                break;
                
                case 0:
                    System.out.println("TELA BLOQUEADA");
                    continuar = false;
                break;

                default:
                    System.out.println("APLICATIVO NÃO INSTALADO");
                    break;
            }
        }
        scanner.close();

    }
        

}
