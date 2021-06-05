package com.tropsmart.resources.comunications;

import java.util.List;

import com.tropsmart.resources.outputs.AuthenticatedOutput;
import com.tropsmart.resources.outputs.BlockedOutput;
import com.tropsmart.resources.outputs.FavoriteOutput;
import com.tropsmart.resources.outputs.PersonOutput;
import com.tropsmart.resources.outputs.PlanOutput;
import com.tropsmart.resources.outputs.SubscriptionOutput;
import com.tropsmart.resources.outputs.UserOutput;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserBoundResponse extends BaseResponse {
    public UserBoundResponse(String title, String message, Integer status) { super(title, message, status);}

    AuthenticatedOutput authenticatedOutput;

    List<AuthenticatedOutput> authenticatedOutputList;

    BlockedOutput blockedOutput;

    List<BlockedOutput> blockedOutputs;

    FavoriteOutput favoriteOutput;

    List<FavoriteOutput> favoriteOutputs;

    PersonOutput personOutput;

    List<PersonOutput> personOutputs;

    PlanOutput planOutput;

    List<PlanOutput> planOutputs;

    SubscriptionOutput subscriptionOutput;

    List<SubscriptionOutput> subscriptionOutputs;

    UserOutput userOutput;

    List<UserOutput> userOutputs;
}
