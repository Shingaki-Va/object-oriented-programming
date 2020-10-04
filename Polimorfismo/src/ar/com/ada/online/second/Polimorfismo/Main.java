package ar.com.ada.online.second.Polimorfismo;

import ar.com.ada.online.second.Polimorfismo.SubClass.ElectricalVehicle;
import ar.com.ada.online.second.Polimorfismo.SubClass.SportVehicle;
import ar.com.ada.online.second.Polimorfismo.SubClass.Truck;
import ar.com.ada.online.second.Polimorfismo.SuperClass.Vehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehicle> arrayList = new ArrayList<Vehicle>();
        arrayList.add(new ElectricalVehicle("Marca1", "Modelo1", 2005, 50));
        arrayList.add(new ElectricalVehicle("Marca2", "Modelo2", 2007, 25));
        arrayList.add(new ElectricalVehicle("Marca3", "Modelo3", 2008, 100));
        arrayList.add(new ElectricalVehicle("Marca4", "Modelo4", 2010, 200));

        arrayList.add(new SportVehicle("Marca1", "Modelo1", 2005, 50));
        arrayList.add(new SportVehicle("Marca2", "Modelo2", 2010, 150));
        arrayList.add(new SportVehicle("Marca3", "Modelo3", 2015, 200));
        arrayList.add(new SportVehicle("Marca4", "Modelo4", 2020, 600));

        arrayList.add(new Truck("Marca1", "Modelo1", 2005, 50));
        arrayList.add(new Truck("Marca2", "Modelo2", 2010, 100));
        arrayList.add(new Truck("Marca3", "Modelo3", 2015, 200));
        arrayList.add(new Truck("Marca4", "Modelo4", 2020, 600));

        for (Vehicle vehicle: arrayList) {
            System.out.println(" ");
            System.out.println(vehicle.tecnicalSheet());
        }

    }
}
