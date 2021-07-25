public class LCS {
    public int GetLCS(String x,String y){
        int Xlength = x.length();
        int Ylength = y.length();
        int[][] LCSTable = new int[Xlength+1][Ylength+1]; //建表C[i][j]
        for(int i=0;i<=Xlength;i++) //初始化表格的基础部分
            LCSTable[i][0] = 0;
        for (int j=0;j<=Ylength;j++)
            LCSTable[0][j] = 0;
        for (int i=1;i<=Xlength;i++)
            for(int j=1;j<=Ylength;j++)
                if(x.charAt(i-1)==y.charAt(j-1))
                    LCSTable[i][j] = LCSTable[i-1][j-1] + 1;
                else if(x.charAt(i-1)>y.charAt(j-1))
                    LCSTable[i][j] = LCSTable[i][j-1];
                else
                    LCSTable[i][j] = Math.max(LCSTable[i-1][j],LCSTable[i][j-1]); //维护表格
        return LCSTable[Xlength][Ylength];
    }
}
