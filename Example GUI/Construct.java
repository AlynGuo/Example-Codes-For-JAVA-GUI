/*
 * Author: 13844768
 * Created: 02 April 2003 08:16:38 PM
 * Modified: 02 April 2003 08:16:38 PM
 */


public class Construct
{
	public static Vertex sV,mV;
	
	public static void DisplayVertexInsert(String s){
		System.out.println("-> Vertex inserted into Graph ["+s+"]");
	}
	
	public static void DisplayEdgeInsert(Edge e){
		Vertex[] V = ((UndirectedEdge)e).getEndPoints();
		double d = 1/((Double)e.element()).doubleValue();
		System.out.println("--> Edge inserted into Graph [Wieght = 1/"+(int)d+"]");
		System.out.println("    Connecting: "+(String)V[0].element());
		System.out.println("                "+(String)V[1].element());
	}
	
	public static Graph CreateGraph(NodeList L){
		Graph G = new Graph();
		Vertex[] VA = new Vertex[L.size()];
		
		String t;
		for (int i = 0; i < VA.length; i++){
			t = (String)L.remove(L.first());
			VA[i] = G.insertVertex(t);
			DisplayVertexInsert(t);
			
			if (i == 0) sV = VA[i];
			if (i == VA.length/2) mV = VA[i];
		}
		Edge e;
		double d;
		for (int i = 0; i < VA.length; i++){
			for (int j = i+1; j < VA.length; j++){
				try {
					d = getLength((String)VA[i].element(),(String)VA[j].element()); 
					e = G.insertEdge(VA[i],VA[j],new Double(d));
					DisplayEdgeInsert(e);			
				}
				catch (noCommonSymbolsException exc){}
			}
		}		
		return G;
	}
	
	public static double getLength(String a, String b) throws noCommonSymbolsException{
		int common = commonSymbols(a.toCharArray(), b.toCharArray());
		if (common == 0)
			throw new noCommonSymbolsException("This exception was suppose to terminate internally");
		return (1/(double)common);		
	}
	
	public static int commonSymbols(char[]a, char[] b){
		int count = 0;
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < b.length; j++){
				if (b[j] != '~'){
					if (a[i] == b[j]){
						b[j] = '~';
						count++;
						break;
					}
				}
			}
		}		
		return count*count;
	}
	
	public static RBTree CreateRedBlackTree(NodeStack N){
		Comparator C = new lexicographicComparator();
		RBTree RBT = new RBTree(C);
		String S;
		while (!N.isEmpty()){
			S = (String)((Vertex)N.pop()).element();
			RBT.insertItem(S,S);
		}		
		return RBT;
	}
}
