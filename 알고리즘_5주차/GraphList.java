class Graph{
	int[][] adjMatrix;
	int N;

	public Graph(int n){
		N=n;
		adjMatrix=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
			adjMatrix[i][j]=0;
		}
	}
}
	public void insertEdge(int u,int v){
		if(u>=N || v>=N){
			System.out.println("Vertex error");
			return;
		}
		adjMatrix[u][v]=1;
	}
	public void printMatrix(){
		for(int i=0; i<N; I++){
			for(int j=0; j<N; J++){
			System.out.print(" "+adjMatrix[i][j]);
		}
		System.out.println():
		}
	}
}