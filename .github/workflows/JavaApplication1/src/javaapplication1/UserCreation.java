/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Gee Prime
 */
public class UserCreation {
  
        public string Name { get; set; }
        public string Surname { get; set; }
        public string ContactNumber { get; set; }
        public string EmailAddress { get; set; }
        public UserType UserType { get; set; }
        public PoliceStationLocation PoliceStationLocation { get; set; }
    }

    public enum UserType
    {
        PoliceOfficerAdmin,
        CrimeInvestigationOfficer,
        Victim,
        Supervisor
    }

    public enum PoliceStationLocation
    {
        Atteridgeville,
        Midrand,
        PretoriaWest,
        Soweto
    }   
