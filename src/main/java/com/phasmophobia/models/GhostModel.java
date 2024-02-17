package com.phasmophobia.models;

import com.phasmophobia.constant.GhostEvidence;
import jakarta.persistence.Entity;

import java.util.ArrayList;

@Entity
public class GhostModel {

    private String name;

    private String securEvidence;

    private String unicAction;

    private ArrayList<GhostEvidence> evidences;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecurEvidence() {
        return securEvidence;
    }

    public void setSecurEvidence(String securEvidence) {
        this.securEvidence = securEvidence;
    }

    public String getUnicAction() {
        return unicAction;
    }

    public void setUnicAction(String unicAction) {
        this.unicAction = unicAction;
    }

    public ArrayList<GhostEvidence> getEvidences() {
        return evidences;
    }

    public void setEvidences(ArrayList<GhostEvidence> evidences) {
        this.evidences = evidences;
    }
}
