import java.io.*;

    public class csvHouse {
        public static void main(String[] args) {

            String path = "D:/house_sales.csv";
            String line = "";

            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null){
                    String[] values = line.split(",");
                    System.out.println("DocumentDate= " + values [0] + ", SalePrice = " + values[1]
                            + ", PropertyID = " + values[2] + ", PropertyType = " + values[3]
                            + ", ym = " + values[4] + ", zhvi_px = " + values[5] + ", zhvi_idx = "
                            + values[6] + ", AdjSalePrice = " + values[7] + ", NbrLivingUnits = " + values[8]
                            + ", SqFtLot = " + values[9] + ", SqFtTotLiving = " + values[10]
                            + ", SqFtFinBasement = " + values[11] + ", Bathrooms = " + values[12]
                            + ", Bedrooms = " + values[13] + ", BldgGrade = " + values[14] + ", YrBuilt = "
                            + values[15] + ", YrRenovated = " + values[16] + ", TrafficNoise = " + values[17]
                            + ", LandVal = " + values[18] + ", ImpsVal = " + values[19] + ", ZipCode = " + values[20]
                            + ", NewConstruction = " + values[21]);



                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                }
        }
    }

