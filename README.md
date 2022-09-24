# Android_Quote_Sharing_App
App to share the code to all installed apps in your device

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

# Code

#### MainActivity.java
```
TextView tvQuote;
Button buttonShare;

//hide the toolbar
getSupportActionBar().hide();

tvQuote = findViewById(R.id.tvQuote);
buttonShare = findViewById(R.id.buttonShare);

        buttonShare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String quoteToShare = tvQuote.getText().toString();

                        Intent intent = new Intent();

                        intent.setAction(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, quoteToShare);

                        startActivity(intent);
                    }
                }
        );
```

# App Highlight

![Quote Share Code](https://user-images.githubusercontent.com/74413402/192095193-846e56fe-7f46-45ec-bf35-109b932ad632.png)
![Quote Share App1](https://user-images.githubusercontent.com/74413402/192095196-156f7515-eb53-4837-a5e5-a4fbed178194.png)
![Quote Share App2](https://user-images.githubusercontent.com/74413402/192095197-ddc16863-cafd-4b3d-aa84-98c697dffe90.png)

