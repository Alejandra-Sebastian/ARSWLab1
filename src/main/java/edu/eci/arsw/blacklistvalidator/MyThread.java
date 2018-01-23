/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.blacklistvalidator.*;
import java.util.List;

/**
 *
 * @author 2110111
 */
public class MyThread extends Thread {
    
    private String ip;
    private int N;
    private List<Integer> checkHostResult;
    
    public MyThread(String ip, int N){
        this.ip = ip;
        this.N = N;
    }
    
    public void run(){
        HostBlackListsValidator hblv = new HostBlackListsValidator();
        checkHostResult = hblv.checkHost(ip, N);
        System.out.println("The host was found in the following blacklists:"+checkHostResult);
    }
    
}
