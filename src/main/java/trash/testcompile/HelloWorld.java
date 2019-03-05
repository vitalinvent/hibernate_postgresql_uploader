//package trash.testcompile;
//import javax.persistence.*;
//import java.io.Serializable;
//public class HelloWorld {
////    public void doStuff() {
////        System.out.println("Hello world");
////    }
//    //
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private long grossIncome;
//    private Integer taxInPercents;
//
//    @Basic
//    @Column(name = "id")
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "grossIncome")
//    public long getGrossIncome() {
//        return grossIncome;
//    }
//
//    public void setGrossIncome(long grossIncome) {
//        this.grossIncome = grossIncome;
//    }
//
//
//    @Basic
//    @Column(name = "taxInPercents")
//    public Integer getTaxInPercents() {
//        return taxInPercents;
//    }
//
//    public void setTaxInPercents(Integer taxInPercents) {
//        this.taxInPercents = taxInPercents;
//    }
//
//    public long getTaxJavaWay() {
//        return grossIncome * taxInPercents / 100;
//    }
//
//    public trash.Kontragent(){}
//
//    public trash.Kontragent(long _grossIncome,int _taxInPercents){
//        this.grossIncome=_grossIncome;
//        this.taxInPercents=_taxInPercents;
//    }
//}
