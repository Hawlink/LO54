/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projet.entity;

import java.util.ArrayList;

/**
 * Class representing a session
 * @author csidawy
 */
public class Session {
    
    private int id;
    private String startDate;
    private String endDate;
    private int maxNbOfStudent;
    private String localisation;
    private ArrayList<Client> clientList;

    public Session(int id, String startDate, String endDate, int maxNbOfStudent, String localisation, ArrayList<Client> clientList) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxNbOfStudent = maxNbOfStudent;
        this.localisation = localisation;
        this.clientList = clientList;
    }

    public int getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getMaxNbOfStudent() {
        return maxNbOfStudent;
    }

    public String getLocalisation() {
        return localisation;
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setMaxNbOfStudent(int maxNbOfStudent) {
        this.maxNbOfStudent = maxNbOfStudent;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }
    
    
    
}
