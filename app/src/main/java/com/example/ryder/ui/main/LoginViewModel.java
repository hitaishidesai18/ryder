package com.example.ryder.ui.main;

import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private FirebaseAuth mAuth;

    public boolean isUserSignedIn() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            return true;
        }
        return false;
    }
    public void signin(){

//        SignInClient oneTapClient;
//        SignInCredential googleCredential = oneTapClient.getSignInCredentialFromIntent(data);
//        String idToken = googleCredential.getGoogleIdToken();
//        if (idToken !=  null) {
//            // Got an ID token from Google. Use it to authenticate
//            // with Firebase.
//            AuthCredential firebaseCredential = GoogleAuthProvider.getCredential(idToken, null);
//            mAuth.signInWithCredential(firebaseCredential)
//                    .addOnCompleteListener((Executor) this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()) {
//                                // Sign in success, update UI with the signed-in user's information
//                                Log.d("debug auth", "signInWithCredential:success");
//                                FirebaseUser user = mAuth.getCurrentUser();
//                                updateStatus(user);
//                            } else {
//                                // If sign in fails, display a message to the user.
//                                Log.w("debug auth", "signInWithCredential:failure", task.getException());
//                                updateStatus(null);
//                            }
//                        }
//                    });
//        }

    }
    public void updateStatus(FirebaseUser firebaseUser){

    }
}