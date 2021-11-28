package cursoemvideo;

public class main {

    public static void main(String[] args) {
//Instancias
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];

//criação dos objetos       
        v[0] = new Video("Aula POO");
        v[1] = new Video("aula 12 PHP");
        v[2] = new Video("Aula 10 de HTML5");

//criação dos objetos
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 21, "F", "Creuzita");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); //Jubileu assiste html 5
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[1]); //jubileu assiste php
        vis[1].avaliar(87.0f);
//chamada para mostrar na tela os resultados gerados
//        System.out.println("---------VIDEOS--------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
//         System.out.println("---------GAEFANHOTOS--------");
//        System.out.println(g[0].toString());
//        System.out.println(g[1].toString());
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());

    }

}
