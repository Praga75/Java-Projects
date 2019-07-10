import java.util.*;
public class back {
	static int N;
	void printSolution(int sol[][]) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}
	boolean solveMaze(int maze[][]) {
		int sol[][]=new int[N][N];
		if(solveMazeutil(maze,0,0,sol)==false) {
			System.out.println("Solution not Exist");
			return false;
		}
		printSolution(sol);
		return true;
	}
	boolean isSafe(int maze[][],int x,int y) {
		return (x>=0&&x<N&&y>=0&&y<N&&maze[x][y]==1);
	}
			
	
	boolean solveMazeutil(int maze[][],int x,int y,int sol[][]) {
		if(x==N-1&&y==N-1) {
			sol[x][y]=1;
			return true;
		}
		
		
		if(isSafe(maze,x,y)==true) {
			sol[x][y]=1;
			if(solveMazeutil(maze,x+1,y,sol)==true) {
				return true;
			}
			if(solveMazeutil(maze,x,y+1,sol)==true) {
				return true;
			}
			sol[x][y]=0;
			return false;
		}
		return false;
	}
			
	
	
	public static void main(String[] args) {
		back rat=new back();
		int maze[][]=  { { 1, 1, 1, 1 }, 
                        { 0, 1, 0, 1 }, 
                        { 0, 1, 1, 0 }, 
                        { 1, 1, 1, 1 } }; 
						
		N=maze.length;
		rat.solveMaze(maze);
	}
}
