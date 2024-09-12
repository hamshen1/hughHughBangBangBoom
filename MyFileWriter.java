import java.io.File;

class MyFileWriter {

    //Prints the size of file in bytes
    public static void printFileSize(String fileName) {
        File fileyFileFile = new File(fileName);
        
        System.out.println(fileyFileFile.length());
    }

    public static void main(String[] args) {
        System.out.println("ASDLKASJDLKASJD");
        printFileSize("example1.txt");
        testPrintTotalFileSize();
     }

     private static void printTotalFileSize(String... fileNames) {
        long totalSize = 0;
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if (file.exists()) {
                totalSize += file.length();
            }
        }
        System.out.println("Total size of all files: " + totalSize + " bytes");
    }

    private static void testPrintTotalFileSize () {
        FileWriteExample.main(new String[0]);
        printTotalFileSize("example1.txt", "example2.txt","example3.txt","example4.txt","example5.txt");
        System.out.println("worked if # was 65 bytes");
    }
    
}
