package com.jwtexample.entity;



public class JwtResponse {
	
	private String jwtToken;
	
	private String username;
	
	public static Builder builder() {
        return new Builder();
    }

	public JwtResponse(String jwtToken, String userName) {
		super();
		this.jwtToken = jwtToken;
		this.username = userName;
	}

	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	@Override
	public String toString() {
		return "JwtResponse [jwtToken=" + jwtToken + ", userName=" + username + "]";
	}
	
	// builder class
	public static class Builder {
        private String jwtToken;
        private String username;

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder userName(String username) {
            this.username = username;
            return this;
        }

        public JwtResponse build() {
            return new JwtResponse(jwtToken, username);
        }
    }
	
	
}
