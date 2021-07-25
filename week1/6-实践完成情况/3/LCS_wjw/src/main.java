public class main {
    public static  void main(String[] argw ){
        int number_different;
        int number_thesame;
        LCS a = new LCS();
        number_thesame = a.GetLCS("javadocument","javadocument"); //最大公共子序列长度12
        number_different = a.GetLCS("The standard doclet does not validate the content of documentation comments","For more information about conformance requirements for HTML5 documents"); //最大公共子序列24
        System.out.println(number_thesame);
        System.out.println(number_different);
    }
}
