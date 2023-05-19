package com.yearup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {

    public void saveContract(Contract contract) {

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Contracts.csv", true));
            if(contract instanceof SalesContract){
                System.out.println("SALE" + "|" + contract.getDate() + "|" + contract.getName() + "|" + contract.getEmail() + "|" +
                        contract.getSold().getVin() + "|" + contract.getSold().getYear() + "|" + contract.getSold().getMake() + "|" + contract.getSold().getModel() + "|" +
                        contract.getSold().getVehicleType() + "|" + contract.getSold().getColor() + "|" + contract.getSold().getOdometer() + "|" + contract.getSold().getPrice()
                        + "|" + ((SalesContract) contract).getSalesTaxAmount() + "|" + ((SalesContract) contract).getRecordingFee() + "|" + ((SalesContract) contract).getProcessingFee() + "|" +
                        contract.getTotalPrice() + "|" + ((SalesContract) contract).isFinance() + "|" + contract.getMonthlyPayment());
            }
            if(contract instanceof LeaseContract){
                System.out.println("LEASE" + "|" + contract.getDate() + "|" + contract.getName() + "|" + contract.getEmail() + "|" +
                        contract.getSold().getVin() + "|" + contract.getSold().getYear() + "|" + contract.getSold().getMake() + "|" + contract.getSold().getModel() + "|" +
                        contract.getSold().getVehicleType() + "|" + contract.getSold().getColor() + "|" + contract.getSold().getOdometer() + "|" + contract.getSold().getPrice()
                        + "|" + ((LeaseContract) contract).getExEndVal() + "|" + ((LeaseContract) contract).getLeaseFee() + "|" + contract.getTotalPrice() + "|" + contract.getMonthlyPayment());
            }
            writer.close();
        }catch(IOException e){
            System.out.println("Could not find file");
        }
    }
}
