package infy_dlscanner.dlscanner;

public class StringExtractor {

    public static void main(String args[]){
        //System.out.println("Hello");
        String dl = "@ " +
                "ANSI " +
                "636035080002DL00410281ZI03220021DLDAQM52478084343 DCSMANGALORE DDEN DACSUSHANTH DDFN DADNONE DDGN DCAD DCBB DCDNONE DBD08312018 DBB12021984 DBA05282019 DBC1 DAU070 in DAYBRO DAG900 W RAND RD APT A407 DAIARLINGTON HEIGHTS DAJIL DAK600040000 DCF20180831308DE2902 DCGUSA DAW190 DCKM52478084343IL6FTL01 DDB09172015 ZIZIAORG ZIB ZIC ZID";



        String[] data = dl.split(" ");
        String dataContains ="";
        for (String s : data) {
            //dataContains += ("Raw data: "+s+ "\n");
            if(s.contains("DCS"))
                dataContains += (s.replace("DCS", "Last Name: ")+ "\n");
            if(s.contains("DAC"))
                dataContains += (s.replace("DAC", "First Name: ")+ "\n");
            if(s.contains("DBA"))
                dataContains += (s.replace("DBA", "License Expiration Date: ")+ "\n");
            }

            System.out.println(dataContains);

    }
}
