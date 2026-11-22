import 'package:flutter/material.dart';
import 'theme/app_colors.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Scaffold(
      appBar: AppBar(title: const Text('Example 1: Flutter'), backgroundColor: AppColors.appBarBackground, foregroundColor: AppColors.appBarForeground),
      body: Column(children: [
        Padding(padding: const EdgeInsets.symmetric(vertical: 25), child: Image.asset('assets/img.png', width: 175, height: 175)),
        buttonRow(),
        const SizedBox(height: 30),
        buttonRow(),
        const Padding(
          padding: EdgeInsets.fromLTRB(15, 35, 85, 0),
          child: Row(children: [
            Expanded(flex: 3, child: Text('Email', style: TextStyle(color: AppColors.emailLabel))),
            Expanded(flex: 7, child: TextField(keyboardType: TextInputType.emailAddress, decoration: InputDecoration(enabledBorder: pinkLine, focusedBorder: pinkLine))),
          ]),
        ),
      ]),
    ),
  ));
}

const pinkLine = UnderlineInputBorder(borderSide: BorderSide(color: AppColors.inputUnderline, width: 2));

Widget buttonRow() {
  return Row(children: [Expanded(child: Center(child: myButton())), Expanded(child: Center(child: myButton()))]);
}

Widget myButton() {
  return ElevatedButton(
    onPressed: () {},
    style: ElevatedButton.styleFrom(backgroundColor: AppColors.buttonBackground, foregroundColor: AppColors.buttonForeground, shape: const RoundedRectangleBorder()),
    child: const Text('BUTTON'),
  );
}