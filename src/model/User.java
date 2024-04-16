package model;

import enam.Role;

import java.util.UUID;

public class User extends  BaseModel{
  //   oybek hamma narsaga teyibb tawamaz biratishka
    private  String username;

    private String password;

    private UUID projectId;

    private  boolean missionM=true;

    private Role role;

    public User(String username, String password, UUID projectId, Role role) {
        this.username = username;
        this.password = password;
        this.projectId = projectId;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getProjectId() {
        return projectId;
    }

    public void setProjectId(UUID projectId) {
        this.projectId = projectId;
    }

    public boolean isMissionM() {
        return missionM;
    }

    public void setMissionM(boolean missionM) {
        this.missionM = missionM;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
