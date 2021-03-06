package folknews.userInputs;

import java.util.Scanner;

import folknews.App;
import folknews.repositories.Armazenar;
import folknews.repositories.RepositorioArtigos;
import folknews.repositories.RepositorioUtilizadores;
import folknews.services.AlteraUtilizador;
import folknews.services.EliminaUtilizador;
import folknews.services.RegistarUtilizador;
import folknews.views.MenuAdmin;

public class AppAdmin {
  private AppAdmin() {}

  public static void execWorkspaceAdmin(RepositorioUtilizadores repositorio, RepositorioArtigos repositorioArtigos) {
    Scanner scanner = new Scanner(System.in);

    MenuAdmin.execMenuAdmin();
    
    int opcao = -1;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
        App.execApp(repositorio, repositorioArtigos);
        break;
        case 1:
        RegistarUtilizador.execRegisto(repositorio);
        MenuAdmin.execMenuAdmin();
        break;
        case 2:
        AlteraUtilizador.execAlteraUtilizador(repositorio);
        MenuAdmin.execMenuAdmin();
        break;
        case 3:
        EliminaUtilizador.execEliminarUtilizador(repositorio);
        MenuAdmin.execMenuAdmin();
        break;
        case 4:
        System.out.println(repositorio.toString());
        MenuAdmin.execMenuAdmin();
        break;
        case 5:
        Armazenar.Write(repositorio);
        MenuAdmin.execMenuAdmin();
        break;
        default:
        System.out.println("Opção inválida.");
      }
    } while (opcao != -1);
    scanner.close();
  }
}
