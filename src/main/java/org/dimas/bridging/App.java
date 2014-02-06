package org.dimas.bridging;

import org.config.spring.hibernate.dao.pokari.ArCustomerDao;
import org.config.spring.hibernate.dao.pokari.CanDDeliveryOrderDao;
import org.config.spring.hibernate.dao.pokari.CanDDeliveryOrderItemDetailDao;
import org.config.spring.hibernate.dao.pokari.CustomerGroupDao;
import org.config.spring.hibernate.dao.pokari.CustomerHirarchyDao;
import org.config.spring.hibernate.dao.pokari.GroupSalesDao;
import org.config.spring.hibernate.dao.pokari.MappingProductDao;
import org.config.spring.hibernate.dao.pokari.ProductBrandDao;
import org.config.spring.hibernate.dao.pokari.SalesTerritoryDao;
import org.config.spring.hibernate.dao.pokari.SpEmployeeDao;
import org.config.spring.hibernate.dao.pokari.TeamSalesDao;
import org.config.spring.hibernate.dao.pokari.TypeSalesDao;
import org.config.spring.hibernate.dao.pokari.WorkplaceDao;
import org.config.spring.hibernate.model.pokari.CanDDeliveryOrder;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
            ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            ApplicationContext appContextMem = ApplicationContextProvider.getInstance().getApplicationContextMem();

//          TMasterOutletDaoInter outlet = (TMasterOutletDaoInter) appContextMem.getBean("TMasterOutletDaoBean");
          
        ArCustomerDao  arCustomerDaoMem = (ArCustomerDao) appContextMem.getBean("ArCustomerDao");
      
        
        CanDDeliveryOrderDao canDDeliveryOrderMem = (CanDDeliveryOrderDao) appContextMem.getBean("CanDDeliveryOrderDao");
        CanDDeliveryOrderItemDetailDao  canDDeliveryOrderItemDetailMem = (CanDDeliveryOrderItemDetailDao) appContextMem.getBean("CanDDeliveryOrderItemDetailDao");
        CustomerGroupDao customerGroupDaoMem = (CustomerGroupDao) appContextMem.getBean("CustomerGroupDao");
        CustomerHirarchyDao customerHirarchyDaoMem =  (CustomerHirarchyDao) appContextMem.getBean("CustomerHirarchyDao");
        GroupSalesDao groupSalesDaoMem = (GroupSalesDao) appContextMem.getBean("GroupSalesDao");
        MappingProductDao mappingProductDaoMem = (MappingProductDao) appContextMem.getBean("MappingProductDao");
        ProductBrandDao productBrandDaoMem = (ProductBrandDao) appContextMem.getBean("ProductBrandDao");
        SalesTerritoryDao salesTerritoryDaoMem = (SalesTerritoryDao) appContextMem.getBean("SalesTerritoryDao");

       SpEmployeeDao spEmployeeDao = (SpEmployeeDao) appContext.getBean("SpEmployeeDao");
       
//        PokariProductDao pokariProductDaoMem = (PokariProductDao) appContextMem.getBean("PokariProductDao");
//        SpEmployeeTargetDao  spEmployeeTargetDaoMem = (SpEmployeeTargetDao) appContextMem.getBean("SpEmployeeTargetDao");
//        SpEmployeeTargetItemDetailDao  spEmployeeTargetItemDetailDaoMem = (SpEmployeeTargetItemDetailDao) appContextMem.getBean("SpEmployeeTargetItemDetailDao");
        TeamSalesDao teamSalesDao = (TeamSalesDao) appContext.getBean("TeamSalesDao");
        TypeSalesDao typeSalesDaoMem = (TypeSalesDao) appContextMem.getBean("TypeSalesDao");
        WorkplaceDao workplaceDaoMem = (WorkplaceDao) appContextMem.getBean("WorkplaceDao");
   
//        
//        TeamSales teamSales1 = new TeamSales();
//        teamSales1.setTeamId("T001");
//        teamSales1.setName("Team Utama");
//        teamSalesDao.saveOrUpdate(teamSales1);
//        
//        SpEmployee employee1 = new SpEmployee();
//        employee1.setSzEmployeeId("002");
//        employee1.setSzName("Ari Untung");
//        employee1.setTeamSales(teamSales1);
//        spEmployeeDao.saveOrUpdate(employee1);
//
//        SpEmployee employee2 = new SpEmployee();
//        employee2.setSzEmployeeId("003");
//        employee2.setSzName("SAIFI");
//        employee2.setTeamSales(teamSales1);
//        spEmployeeDao.saveOrUpdate(employee2);

       
//        List<TeamSales> teamSaleses = teamSalesDao.findAll();
//        if (teamSaleses.size()>0) {
//            for(TeamSales item: teamSaleses){
//                TeamSales teamSales = new TeamSales();
//                teamSales = item;
//                System.out.println(teamSales.getTeamId() + "\t" + teamSales.getName());
//                List<SpEmployee> employees  = new ArrayList<>(teamSales.getSpEmployeeSet());
//                for (SpEmployee employee: employees) {
//                    System.out.println(employee.getSzEmployeeId() + "\t" + employee.getSzName());
//                }
//            }   
//        } else {
//            System.out.println("Kosong Boss");
//        }
        
        System.out.println( "Hello World!" );
        
        
    }
}
