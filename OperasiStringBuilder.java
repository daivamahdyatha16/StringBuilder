package dicoding.belajarjava.String;
import java.awt.print.PrinterGraphics;
import java.lang.StringBuilder;

public class OperasiStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("halo");
        PrintData(builder);
        //append
        builder.append(" teman semua");
        PrintData(builder);

        builder.append(" apa kabar");
        PrintData(builder);

        //insert
        builder.insert(10, " SMA 4 Semarang");
        PrintData(builder);

        //delete
        builder.delete(25,31);
        PrintData(builder);

        //rubah karakter pada index tertentu
        builder.setCharAt(13, 'P');
        PrintData(builder);

        //replace
        builder.replace(17,25, "Malang");
        PrintData(builder);

        //casting menjadi string
        String kalimat = builder.toString();
        int addressString = System.identityHashCode(kalimat);
        System.out.println("\naddress = " +Integer.toHexString(addressString ));
    }
    private static void PrintData (StringBuilder dataBuilder){
        System.out.println("data = " +dataBuilder);
        System.out.println("panjang = " +dataBuilder.length());
        System.out.println("kapasitas = " +dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("\naddress = " +Integer.toHexString(addressBuilder));
    }
}
