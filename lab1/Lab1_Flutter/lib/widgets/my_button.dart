
// Reusable button
import 'package:lab_1_flutter/theme/app_colors.dart';
import 'package:material_ui/material_ui.dart';

class MyButton extends StatelessWidget {
  const MyButton({super.key, required this.number});

  final int number;

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      height: 65,
      child: ElevatedButton(
        onPressed: () {},
        style: ElevatedButton.styleFrom(
          backgroundColor: AppColors.buttonBackground,
          foregroundColor: AppColors.buttonForeground,
          elevation: 3,
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(4),
          ),
        ),
        child: Text(
          'Click Me $number',
          style: const TextStyle(
            fontSize: 18,
            fontWeight: FontWeight.w500,
          ),
        ),
      ),
    );
  }
}