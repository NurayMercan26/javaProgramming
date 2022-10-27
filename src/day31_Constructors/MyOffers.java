package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

      Offer  offer1=  new Offer();
      offer1.setInfo("VA","Amazon Inc","SDET",110000,true,true,true,true);

      Offer offer2 = new Offer();
      offer2.setInfo("CA","Sony Inc","QA",120000.0,true,false,false,true);

      Offer offer3= new Offer();
      offer3.setInfo("FL","Apple Inc","QE",125000,true,true,true,true);

      Offer offer4 = new Offer();
      offer4.setInfo("TX", "CapitalOne","SM",115000,false,false,true,false);

      Offer offer5 = new Offer();
      offer5.setInfo("WA","Bank Of America","BA",130000,true,true,false,true);


        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

      System.out.println("--------------------------------------------------------------");

        Offer [] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer>fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p-> !p.isFullTime);//removes if the offer is Not fulltime

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!(p.location.equals("VA")|| p.location.equals("CA")));//removes the offer is not from area

        System.out.println(localOffers.size());

        ArrayList<Offer>offersWithBenefits =new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit);
        System.out.println(offersWithBenefits.size());

        ArrayList<Offer> hasPTO = new ArrayList<>(Arrays.asList(myOffers));
        hasPTO.removeIf(p->!p.hasPTO);
        System.out.println(hasPTO.size());

        ArrayList<Offer>jopTitle = new ArrayList<>(Arrays.asList(myOffers));
        jopTitle.removeIf(p-> !p.jopTitle.equals("SDET"));
        System.out.println(jopTitle.size());

        ArrayList<Offer>salary = new ArrayList<>(Arrays.asList(myOffers));
        salary.removeIf(p-> !(p.salary<=100000));
        System.out.println(salary.size());

      for (Offer localOffer : localOffers) {

        System.out.println(localOffer.companyName +" : "+localOffer.salary);

      }

    }
}
/*
Create a class named myOffers:

2.1 Create 7 objects of offer
2.2. Create an array of Offers named MyOffers and store all 7 objects of offers
2.3. Create an arraylist of offer named fullTimeOffers and add all the offer objects
2.3.1 Write a program that can remove  the offer objects that are not full-time
2.4. Create an Arraylist of offer named local Offers and add all the offer objects.
2.4.1.Write a program that can remove  the offers objects that are not local
2.5. Create an Arraylist of offer named offersWithBenefits and add all the offer objects.
2.5.1. Write a program that can remove  all the offers objects that dosent have benefit and does not have PTO
2.6. Create an Arraylist of offer named sdetOffers and add all the offer objects.
2.6.1.Write a program that can remove  all the offers that are not for SDET
2.7. Create an Arraylist of offer named offersWith100K and add all the offer objects.
2.7.1. Write a program that can remove  all the offers that are offering less than 100K salary
 */