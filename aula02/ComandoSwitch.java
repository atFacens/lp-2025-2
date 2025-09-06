public class ComandoSwitch {
    public static void main(String[] args) {
        int opcao = 5;

        if (opcao == 1) {
            System.out.println("Vc escolheu 1");
        } else {
             if (opcao == 2) {
                System.out.println("Vc escolheu 2");
            } else {
                 if (opcao == 3) {
                    System.out.println("Vc escolheu 3");
                } else {
                     if (opcao == 4) {
                            System.out.println("Vc escolheu 4");
                        } else {
                            System.out.println("Vc escolheu errado");
                        }
                }
            }
        }

        switch (opcao) {
            case 1:
                System.out.println("Vc escolheu 1");
                break;
            case 2:
                System.out.println("Vc escolheu 2");
                break;
            case 3:
                System.out.println("Vc escolheu 3");
                break;
            case 4:
                System.out.println("Vc escolheu 4");
                break;
            default:
                System.out.println("Vc escolheu errado");
        }

        String opcaoTexto = "2";

        switch (opcaoTexto) {
            case "1":
                System.out.println("Vc escolheu 1");
                break;
            case "2":
                System.out.println("Vc escolheu 2");
                break;
            case "3":
                System.out.println("Vc escolheu 3");
                break;
            case "4":
                System.out.println("Vc escolheu 4");
                break;
            default:
                System.out.println("Vc escolheu errado");
        }
    }
}
