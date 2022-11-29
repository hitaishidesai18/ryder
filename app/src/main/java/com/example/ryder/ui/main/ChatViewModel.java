package com.example.ryder.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ryder.ChatMessage;

import java.util.List;

public class ChatViewModel extends ViewModel {
    private MutableLiveData<List<ChatMessage>> mChatMessages;

    //TODO: initialize mutable live data

    public MutableLiveData<List<ChatMessage>> initChat(){
        if(mChatMessages==null){
            mChatMessages = new MutableLiveData<>();
        }
        return mChatMessages;
    }
    public MutableLiveData<List<ChatMessage>> getmChatMessages() {
        initChat();
        return mChatMessages;
    }

    public void setmChatMessages(MutableLiveData<List<ChatMessage>> mChatMessages) {
        this.mChatMessages = mChatMessages;
    }
    public void sendMessage(ChatMessage chatMessage){
        //TODO
    }
}
