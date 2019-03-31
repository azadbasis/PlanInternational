package com.nanosoft.planInternational.tracking.database.model;

/**
 * Created by Nanosoft-Android on 4/17/2017.
 */

public class SCFamilyInfos {

    private int id;
    private int sc_id;
    private String member_full_name;
    private String member_name_known_by;
    private String member_relationship;
    private String member_occupation;
    private String member_gender;
    private int member_birth_year;
    private String member_is_primary_carer;

    public SCFamilyInfos(int id, int sc_id, String member_full_name, String member_name_known_by, String member_relationship,
                         String member_occupation, String member_gender, int member_birth_year, String member_is_primary_carer) {
        this.id = id;
        this.sc_id = sc_id;
        this.member_full_name = member_full_name;
        this.member_name_known_by = member_name_known_by;
        this.member_relationship = member_relationship;
        this.member_occupation = member_occupation;
        this.member_gender = member_gender;
        this.member_birth_year = member_birth_year;
        this.member_is_primary_carer = member_is_primary_carer;
    }

    public SCFamilyInfos(int sc_id, String member_full_name, String member_name_known_by, String member_relationship,
                         String member_occupation, String member_gender, int member_birth_year, String member_is_primary_carer) {
        this.sc_id = sc_id;
        this.member_full_name = member_full_name;
        this.member_name_known_by = member_name_known_by;
        this.member_relationship = member_relationship;
        this.member_occupation = member_occupation;
        this.member_gender = member_gender;
        this.member_birth_year = member_birth_year;
        this.member_is_primary_carer = member_is_primary_carer;
    }

    public int getId() {
        return id;
    }

    public int getSc_id() {
        return sc_id;
    }

    public String getMember_full_name() {
        return member_full_name;
    }

    public String getMember_name_known_by() {
        return member_name_known_by;
    }

    public String getMember_relationship() {
        return member_relationship;
    }

    public String getMember_occupation() {
        return member_occupation;
    }

    public String getMember_gender() {
        return member_gender;
    }

    public int getMember_birth_year() {
        return member_birth_year;
    }

    public String getMember_is_primary_carer() {
        return member_is_primary_carer;
    }
}
