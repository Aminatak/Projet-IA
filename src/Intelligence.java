import java.util.Scanner;

public class Intelligence {

	/*Evolution
	 * 1. Construire le plateau
	 * 2. Placer les joueurs
	 * 3.Jouer
	 * 4. Detecter le gain
	 * 
	 */

	public static void main(String[] args) {
		//Objectif:
		//Afficher Le plateau et les pions, 
		// Demander au joueur de choisir la colonne (trois colonnes au total)?
		//Demadez à l'user de choisir la position d'arriver
		// Verifier les positions possibles (si une seule libre on place le point sinon ?
		//on demande "haut, bas, gauche ou droite ?", si 0 libre, demandez de choisir une autre colonne

		int line = 3, column = 3;
		char[][] plateau = new char[column][line];
		Scanner sc = new Scanner(System.in);
		int i;

		//.......................................................................................................................................................		

		//Remplissage

		//Prémière ligne --> Joueur 1 == O et joueur 2 == X
		for(i=0; i<column; i++)
			for(int j=0; j<line-2; j++){
				plateau[i][j] = 'O';
			}

		//Deuxième ligne
		for(i=0; i<column; i++)
			for(int j=1; j<line-1; j++){
				plateau[i][j] = '.';
			}

		//Troisième ligne
		for(i=0; i<column; i++)
			for(int j=2; j<line; j++){
				plateau[i][j] = 'X';
			}

		//.........................................................................................................................................................

		//Affichage du plateau
		System.out.println("\nLe plateau de jeu");

		for(int trait=0; trait < (column+2+2*column)*2-3; trait ++) System.out.print('-');
		System.out.println();

		for(i=0; i < column; i++){
			for(int j=0; j < line; j++){
				System.out.print("|"+plateau[j][i] + "|" +"\t");
			}
			System.out.println();
		}

		for(int trait=0; trait < (column+2+2*column)*2-3; trait ++) System.out.print('-');


		//.........................................................................................................................................................

		//Debut de jeu

		char joueur = (i%2==1 ? 'X' : 'O');
		System.out.println("\nTour du joueur " +joueur );

		int choixColonne, position ;

		System.out.println("Entrez le numero de la colonne [0, 1 ou 2]:");
		choixColonne = sc.nextInt();

		System.out.println("Entrez la position : ");
		position = sc.nextInt();

		switch(choixColonne){
		
		case 1 :

				if(plateau[choixColonne][position] == '.' | plateau[choixColonne][position] ==' '){
					plateau[choixColonne][position] = joueur;
					System.out.println("break");
				}
				else
					System.out.println("Entrez la position :");	

			break;	


		}

		//Reaffichage du plateau
				System.out.println("Le plateau de jeu");

				for(int trait=0; trait < (column+2+2*column)*2-3; trait ++) System.out.print('-');
				System.out.println();

				for(i=0; i < column; i++){
					for(int j=0; j < line; j++){
						System.out.print("|"+plateau[j][i] + "|" +"\t");
					}
					System.out.println();
				}

				for(int trait=0; trait < (column+2+2*column)*2-3; trait ++) System.out.print('-');}


	}