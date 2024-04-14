package tatcheff;
import tatcheff.box.Box;
import tatcheff.goods.Goods;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //task 1
        Box box = new Box(2, 3, 4);
        System.out.println(box);
        double increasePercentage = 99;


        box.IncreaseDimensionCond(101, 1000);
        System.out.println(box);
        {
            System.out.println(readGoodsFromFile("src/main/java/tatcheff/example.txt"));
            Goods goods = new Goods("Name", 12.5);
            Goods goods1 = new Goods("Name2", 10.5);

            writeGoods("src/main/java/tatcheff/example.txt", goods);
            writeGoods("src/main/java/tatcheff/example.txt", goods1);
        }
    }

    public static List<String> readGoodsFromFile(String filePath) {
        List<String> goods = new ArrayList<>();
        try (FileReader fis = new FileReader(new File(filePath))) {
            BufferedReader br = new BufferedReader(fis);
            String line;
            while ((line = br.readLine()) != null) {
                goods.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        return goods;
    }

    public static void writeGoods(String outputFilePath, Goods goods) {
        FileWriter fout = null;

        try {
            fout = new FileWriter(new File(outputFilePath), false);

            if (goods != null) {
                fout.append(goods.toString()).append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File was not found");
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}