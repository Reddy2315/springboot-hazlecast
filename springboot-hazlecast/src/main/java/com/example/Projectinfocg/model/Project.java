package com.example.Projectinfocg.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {
    @Id
    @GeneratedValue
    public int id;
    public String projectname;
    public String projectdesc;
    public String projectstatus;
    public String projectmanager;
    public String projectclient;
    public String projectstartdate;
    public String projectenddate;
    public String projectcost;
    public int projectmembers;
    //public List<String> projectmemebersnames;
    public String projectmanageremail;
    public String projectlinks;
    public  String projectreviewdate;
}
