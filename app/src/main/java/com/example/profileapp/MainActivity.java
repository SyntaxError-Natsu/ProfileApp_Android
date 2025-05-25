package com.example.profileapp;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // UI Components
    private ImageView btnBack;
    private LinearLayout btnSupport;
    private FrameLayout btnEdit;
    private de.hdodenhof.circleimageview.CircleImageView profileImage;
    private TextView tvUsername;

    private LinearLayout credGarageSection;
    private LinearLayout creditScoreSection;
    private LinearLayout lifetimeCashbackSection;
    private LinearLayout bankBalanceSection;

    private LinearLayout cashbackBalanceItem;
    private LinearLayout coinsItem;
    private LinearLayout referEarnItem;
    private LinearLayout allTransactionsItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        initializeUIComponents();

        setupClickListeners();
    }

    private void initializeUIComponents() {
        // Header components
        btnBack = findViewById(R.id.btn_back);
        btnSupport = findViewById(R.id.btn_support);

        // Profile section
        profileImage = findViewById(R.id.profile_image);
        tvUsername = findViewById(R.id.tv_username);
        btnEdit = findViewById(R.id.btn_edit);

        // Main sections
        credGarageSection = findViewById(R.id.cred_garage_section);
        creditScoreSection = findViewById(R.id.credit_score_section);
        lifetimeCashbackSection = findViewById(R.id.lifetime_cashback_section);
        bankBalanceSection = findViewById(R.id.bank_balance_section);

        // Rewards section items
        cashbackBalanceItem = findViewById(R.id.cashback_balance_item);
        coinsItem = findViewById(R.id.coins_item);
        referEarnItem = findViewById(R.id.refer_earn_item);
        allTransactionsItem = findViewById(R.id.all_transactions_item);
    }

    private void setupClickListeners() {
        // Header clicks
        btnBack.setOnClickListener(v -> showToast("Back clicked"));
        btnSupport.setOnClickListener(v -> showToast("Support clicked"));

        // Profile clicks
        profileImage.setOnClickListener(v -> showToast("Profile image clicked"));
        btnEdit.setOnClickListener(v -> showToast("Edit profile clicked"));

        // Main section clicks
        if (credGarageSection != null) {
            credGarageSection.setOnClickListener(v -> showToast("CRED Garage clicked"));
        }

        if (creditScoreSection != null) {
            creditScoreSection.setOnClickListener(v -> showToast("Credit Score clicked"));
        }

        if (lifetimeCashbackSection != null) {
            lifetimeCashbackSection.setOnClickListener(v -> showToast("Lifetime Cashback clicked"));
        }

        if (bankBalanceSection != null) {
            bankBalanceSection.setOnClickListener(v -> showToast("Bank Balance clicked"));
        }

        // Rewards section clicks
        if (cashbackBalanceItem != null) {
            cashbackBalanceItem.setOnClickListener(v -> showToast("Cashback Balance clicked"));
        }

        if (coinsItem != null) {
            coinsItem.setOnClickListener(v -> showToast("Coins clicked"));
        }

        if (referEarnItem != null) {
            referEarnItem.setOnClickListener(v -> showToast("Refer & Earn clicked"));
        }

        if (allTransactionsItem != null) {
            allTransactionsItem.setOnClickListener(v -> showToast("All Transactions clicked"));
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
