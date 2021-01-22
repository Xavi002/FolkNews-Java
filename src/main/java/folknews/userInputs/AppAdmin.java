package folknews.userInputs;

import java.util.Scanner;

import folknews.App;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.MenuAdmin;

public class AppAdmin {
  private AppAdmin() {}

  public static void execWorkspaceAdmin(RepositorioUtilizadores repositorio) {
    Scanner scanner = new Scanner(System.in);

    // RegistarUtilizador registar = new RegistarUtilizador();
    // RepositorioUtilizadores repositorio = new RepositorioUtilizadores();

    MenuAdmin.execMenuAdmin();
    
    int opcao = -1;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
        App.execApp(repositorio);
        break;
        case 1:
        // registar.execRegisto(repositorio);
        break;
        case 2:
        System.out.println("FOI!");
        break;
        case 5:
        System.out.println(repositorio.toString());
        break;
        default:
        System.out.println("Opção inválida.");
      }
    } while (opcao != -1);
    scanner.close();
  }
}