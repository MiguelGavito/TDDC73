
import 'package:lab_1_flutter/widgets/illustration.dart';
import 'package:lab_1_flutter/widgets/my_button.dart';

import 'theme/app_colors.dart';
import 'package:material_ui/material_ui.dart';

void main() {
  runApp(const MyApp());
}

// Main application
class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: const HomePage(),
    );
  }
}

// Main screen
class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Example 1: Flutter'),
        backgroundColor: AppColors.appBarBackground,
        foregroundColor: AppColors.appBarForeground,
      ),

      body: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.symmetric(horizontal: 30),

          child: Column(
            children: [

              // Circular illustration
              const SizedBox(height: 15),
              const Illustration(),

              const SizedBox(height: 60),

              // First button row
              Row(
                children: [
                  Expanded(child: MyButton(number: 1)),
                  const SizedBox(width: 55),
                  Expanded(child: MyButton(number: 2)),
                ],
              ),

              const SizedBox(height: 40),

              // Second button row
              Row(
                children: [
                  Expanded(child: MyButton(number: 3)),
                  const SizedBox(width: 55),
                  Expanded(child: MyButton(number: 4)),
                ],
              ),

              const SizedBox(height: 80),

              // Email input
              Row(
                children: [
                  const SizedBox(
                    width: 95,
                    child: Text(
                      'Email',
                      style: TextStyle(
                        fontSize: 20,
                        color: Colors.grey,
                      ),
                    ),
                  ),

                  Expanded(
                    child: TextField(
                      keyboardType: TextInputType.emailAddress,
                      decoration: const InputDecoration(
                        enabledBorder: UnderlineInputBorder(
                          borderSide: BorderSide(
                            color: AppColors.inputUnderline,
                            width: 2,
                          ),
                        ),
                        focusedBorder: UnderlineInputBorder(
                          borderSide: BorderSide(
                            color: AppColors.inputUnderline,
                            width: 2,
                          ),
                        ),
                      ),
                    ),
                  ),
                ],
              ),

              const SizedBox(height: 30),
            ],
          ),
        ),
      ),
    );
  }
}
