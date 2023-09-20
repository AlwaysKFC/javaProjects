public class Main{
    public static void main(String[] args){
        Car car = new Car();

        car.setCompany_name("Mazda");
        car.setModel_name("Miata");
        car.setYear(1990);

        String company_name = car.getCompany_name();
        String model_name = car.getModel_name();
        int year = car.getYear();
        double mileague = car.getMileague();

        System.out.println("Company name: " + company_name);
        System.out.println("Model name: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileague: " + mileague);
    }
}