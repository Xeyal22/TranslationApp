package service.impl;

import javafx.scene.control.Menu;
import service.ManagementService;
import util.MenuUtil;

public class ManagementServiceImpl implements ManagementService {

    @Override
    public void manage() {
        // TODO Auto-generated method stub
               
        int option=MenuUtil.showMenu();
        switch(option){
            case:

        }

        throw new UnsupportedOperationException("Unimplemented method 'manage'");
    }
    
}
