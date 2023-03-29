 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Gee Prime
 */
public class CaseCreation {
 public class Case
    {
        public int CaseNumber { get; set; }
        public CaseType CaseType { get; set; }
        public string CaseDescription { get; set; }
        public User UserAssigned { get; set; }
        public CaseStatus CaseStatus { get; set; }
        public User CreatedBy { get; set; }
        public DateTime CreatedDate { get; set; }
        public DateTime LastUpdatedDate { get; set; }
        public string Comments { get; set; }
    }

    public enum CaseType
    {
        Theft,
        Housebreaking,
        Hijacking,
        Assault,
        Kidnapping,
        HomeRobbery,
        Murder,
        SexualOffence,
        StreetRobbery,
        ConsumerFraud
    }

    public enum CaseStatus
    {
        ToDo,
        InProgress,
        Completed,
        Closed,
        Cancelled
    }

    public class User
    {
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
}
