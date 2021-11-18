# Android_Quote_Sharing_App
App to share the code to all installed apps in your device

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

<img src="app_images/Quote Share Code.png" width="1000" /><br>

<img src="app_images/Quote Share App1.png" width="300" /><br>

<img src="app_images/Quote Share App2.png" width="300" /><br>
