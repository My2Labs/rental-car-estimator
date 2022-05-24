class App {

  public static void main(String args[]) {
    String pickupDate = "Pickup date: 07/04/2022";
    String eachDay = "/day ";
    double carRental = 29.99;
    int rentalDays = 5;
    double tollTag = 3.95;
    double gps = 2.95;
    double roadsideAss = 3.95;
    int currentAge = 21;
    double currentAgeSurcharge = .30;
    double surchargeFee = (carRental * currentAgeSurcharge);
    double total;
    total = ((carRental * rentalDays) + (roadsideAss * rentalDays) + (gps * rentalDays)
        + surchargeFee);

    StringBuilder questions = new StringBuilder();
    questions.append(pickupDate + " ; " + "\r\n");
    questions.append(carRental);
    questions.append(eachDay + " ; " + "\r\n");
    questions.append(rentalDays);
    questions.append(" rental days - " + "\r\n");
    questions.append("Toll Tag: " + tollTag);
    questions.append(eachDay + " ; " + "\r\n");
    questions.append("GPS Services: " + gps);
    questions.append(eachDay + " ; " + "\r\n");
    questions.append("Roadside Assistance: " + roadsideAss);
    questions.append(eachDay + " ; " + "\r\n");
    questions.append("Current Age: " + currentAge + " ; " + "\r\n");
    questions.append("Underage Driver Surcharge: " + surchargeFee + " ; " + "\r\n");
    questions.append("Total Cost of Rental: $");
    questions.append(String.format("%.2f", total));

    System.out.println(questions);
  }
}
