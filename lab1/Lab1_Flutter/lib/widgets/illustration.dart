
// Circular illustration
import 'package:lab_1_flutter/theme/app_colors.dart';
import 'package:material_ui/material_ui.dart';

class Illustration extends StatelessWidget {
  const Illustration({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 230,
      height: 230,
      decoration: const BoxDecoration(
        shape: BoxShape.circle,
        color: AppColors.illustrationBackground,
      ),

      child: Stack(
        alignment: Alignment.center,
        children: [

          const Positioned(
            top: 12,
            child: Text('🎓', style: TextStyle(fontSize: 28)),
          ),

          const Positioned(
            right: 12,
            child: Text('📚', style: TextStyle(fontSize: 28)),
          ),

          const Positioned(
            bottom: 12,
            child: Text('🌎', style: TextStyle(fontSize: 28)),
          ),

          const Positioned(
            left: 12,
            child: Text('🧪', style: TextStyle(fontSize: 28)),
          ),

          Container(
            width: 105,
            height: 105,
            decoration: const BoxDecoration(
              shape: BoxShape.circle,
              color: AppColors.illustrationInnerCircle,
            ),
            child: const Center(
              child: Text(
                '📖',
                style: TextStyle(fontSize: 32),
              ),
            ),
          ),
        ],
      ),
    );
  }
}