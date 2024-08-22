import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ponto p1 = new Ponto(2.0, 3.0);
        Ponto p2 = new Ponto(3.0, 4.0);
        Ponto p3 = new Ponto(8.0, 9.0);
        Ponto p4 = new Ponto(7.0, 8.0);
        Ponto p5 = new Ponto(10.0, 12.0);


        ArvBinaria cluster1 = new ArvBinaria(new Cluster(p1));
        ArvBinaria cluster2 = new ArvBinaria(new Cluster(p2));
        ArvBinaria cluster3 = new ArvBinaria(new Cluster(p3));
        ArvBinaria cluster4 = new ArvBinaria(new Cluster(p4));
        ArvBinaria cluster5 = new ArvBinaria(new Cluster(p5));

        List<ArvBinaria> listaClusters = new ArrayList<>();
        listaClusters.add(cluster1);
        listaClusters.add(cluster2);
        listaClusters.add(cluster3);
        listaClusters.add(cluster4);
        listaClusters.add(cluster5);


        ArvBinaria arvoreFinal = ArvBinaria.clusterizar(listaClusters);

       
        System.out.println("Estrutura da árvore de clusterização:");
        arvoreFinal.mostra();
    }
}
