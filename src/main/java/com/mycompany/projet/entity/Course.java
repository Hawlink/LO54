/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projet.entity;

import java.util.ArrayList;

/**
 * Class representing a course
 * @author csidawy
 */
public class Course {
    
    private int id;
    private String titre;
    private ArrayList<Session> sessionList;

    public Course(int id, String titre, ArrayList<Session> sessionList) {
        this.id = id;
        this.titre = titre;
        this.sessionList = sessionList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setSessionList(ArrayList<Session> sessionList) {
        this.sessionList = sessionList;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public ArrayList<Session> getSessionList() {
        return sessionList;
    }
    
}
