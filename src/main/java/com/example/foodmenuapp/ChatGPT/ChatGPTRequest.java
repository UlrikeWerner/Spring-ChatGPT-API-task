package com.example.foodmenuapp.ChatGPT;

import java.util.List;

public record ChatGPTRequest(
        String model,
        List<ChatGPTMessage> messages
) {
}
