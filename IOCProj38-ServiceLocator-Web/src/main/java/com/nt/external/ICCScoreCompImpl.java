package com.nt.external;

public class ICCScoreCompImpl implements ICCScoreComp {

	public String getScore(int matchId) {
		if(matchId==1001)
			return "IND vs AUS ---->300/8";
		else if(matchId==1002)
			return "IND vs PAK ---->500/8";
		else
			return "InValid MatchId";
	}
	
}
